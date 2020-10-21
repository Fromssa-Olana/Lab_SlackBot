package com.floreo.bbah;

import com.floreo.bbah.model.Attachment;
import com.floreo.bbah.network.Slack;

public class Main {

    public static void main(String[] args) {

        Bot myBot = new Bot();

        myBot.testApi();

        myBot.listChannels();

        myBot.listMessages(Slack.BOTS_CHANNEL_ID);

        //Attachment attachment = new Attachment("Required plain-text summary of the attachment.", "#36a64f",
               // "Optional text that appears above the attachment block","Bobby Tables",
                //"http://flickr.com/bobby/","http://flickr.com/icons/bobby.jpg");

        // Post "I like cats" to the #bots channel
        myBot.sendTaco("I like cats");

        // Post a taco cat photo to the #bots channel
        myBot.sendTaco("https://images.dailykos.com/images/295092/story_image/Taco-Cat-Spelled-Backwards-Is-Taco-Cat.-e1430184838220_1_.jpg?1472864097");

    }
}
