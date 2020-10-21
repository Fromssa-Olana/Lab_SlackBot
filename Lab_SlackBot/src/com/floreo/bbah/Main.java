package com.floreo.bbah;

import com.floreo.bbah.model.Attachment;
import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        // Post "I like cats" to the #bots channel
        myBot.sendMessage("I like cats");

        // Post a taco cat photo to the #bots channel
        myBot.sendMessage("https://images.dailykos.com/images/295092/story_image/Taco-Cat-Spelled-Backwards-Is-Taco-Cat.-e1430184838220_1_.jpg?1472864097");

    }
}
