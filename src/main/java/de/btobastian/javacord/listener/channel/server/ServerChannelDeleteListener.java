package de.btobastian.javacord.listener.channel.server;

import de.btobastian.javacord.event.channel.server.ServerChannelDeleteEvent;
import de.btobastian.javacord.listener.GloballyAttachableListener;
import de.btobastian.javacord.listener.ObjectAttachableListener;
import de.btobastian.javacord.listener.server.ServerAttachableListener;

/**
 * This listener listens to server channel deletions.
 */
@FunctionalInterface
public interface ServerChannelDeleteListener extends ServerAttachableListener, ServerChannelAttachableListener,
                                                     GloballyAttachableListener, ObjectAttachableListener {

    /**
     * This method is called every time a server channel is deleted.
     *
     * @param event The event.
     */
    void onServerChannelDelete(ServerChannelDeleteEvent event);

}