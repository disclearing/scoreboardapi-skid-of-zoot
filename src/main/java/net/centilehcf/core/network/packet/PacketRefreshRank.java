package net.centilehcf.core.network.packet;

import com.google.gson.JsonObject;
import com.minexd.pidgin.packet.Packet;
import net.centilehcf.core.util.json.JsonChain;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import net.centilehcf.core.util.json.JsonChain;

@AllArgsConstructor
@Getter
public class PacketRefreshRank implements Packet {

	private UUID uuid;
	private String name;

	public PacketRefreshRank() {

	}

	@Override
	public int id() {
		return 5;
	}

	@Override
	public JsonObject serialize() {
		return new JsonChain()
				.addProperty("uuid", uuid.toString())
				.addProperty("name", name)
				.get();
	}

	@Override
	public void deserialize(JsonObject jsonObject) {
		uuid = UUID.fromString(jsonObject.get("uuid").getAsString());
		name = jsonObject.get("name").getAsString();
	}

}