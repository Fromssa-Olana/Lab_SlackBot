package com.floreo.bbah;

import com.floreo.bbah.model.RandomCat;
import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        // Post a random taco cat photo with a short message to the #bots channel
        myBot.sendMessage("Here's a random taco cat. \n" + RandomCat.getPictureLink());

    }
}
