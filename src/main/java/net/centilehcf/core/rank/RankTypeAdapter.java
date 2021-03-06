package net.centilehcf.core.rank;

import com.qrakn.honcho.command.adapter.CommandTypeAdapter;
import java.util.ArrayList;
import java.util.List;

public class RankTypeAdapter implements CommandTypeAdapter {

    @Override
    public <T> T convert(String string, Class<T> type) {
        return type.cast(Rank.getRankByDisplayName(string));
    }

    @Override
    public <T> List<String> tabComplete(String string, Class<T> type) {
        List<String> completed = new ArrayList<>();

        for (Rank rank : Rank.getRanks().values()) {
            if (rank.getDisplayName().toLowerCase().startsWith(string)) {
                completed.add(rank.getDisplayName());
            }
        }

        return completed;
    }

}
