package me.evyn.baristabot.commands.information;

import me.evyn.baristabot.commands.Command;
import me.evyn.baristabot.commands.CommandType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

/**
 * Simple ping command, responds with "Pong!"
 */
public class Ping implements Command {

    private final String name = "ping";
    private final String description = "Replies with `Pong!` in the channel that the command was sent";
    private final String usage = "ping";
    private final CommandType type = CommandType.TESTING;

    @Override
    public void run(MessageReceivedEvent event, List<String> args) {
        event.getChannel()
                .sendMessage("Pong!")
                .queue();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String getUsage() {
        return this.usage;
    }

    @Override
    public CommandType getType() {
        return this.type;
    }
}