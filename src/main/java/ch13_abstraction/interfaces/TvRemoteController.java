package ch13_abstraction.interfaces;

public class TvRemoteController {
    private PowerButton powerButton;
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;

    public TvRemoteController(PowerButton powerButton, ChannelDownButton channelDownButton, ChannelUpButton channelUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
    }
}