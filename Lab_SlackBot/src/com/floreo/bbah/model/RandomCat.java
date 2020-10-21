package com.floreo.bbah.model;

import java.util.*;

public class RandomCat {

    static String[] catPhotos = {"https://i.kym-cdn.com/photos/images/original/001/216/842/8a7.jpg",
            "https://preview.redd.it/4qa8xam6bbt01.jpg?auto=webp&s=1ca25578aaf0fa89ea0df0d7cc5cd36bf1ff3916",
            "https://cdn.shopify.com/s/files/1/0024/2735/5180/products/image_4d8f5591-4f3d-4509-b9fd-ca757c66eca7_2048x.jpg?v=1598570744",
            "https://images.dailykos.com/images/295092/story_image/Taco-Cat-Spelled-Backwards-Is-Taco-Cat.-e1430184838220_1_.jpg?1472864097",
            "https://www.greenwellnesslife.com/wp-content/uploads/2019/10/taco-cat.jpg"};

    public static String getPictureLink(){
        // initialize new Random object as rand
        Random rand = new Random();

        /* make an integer called randomNum be equal to the first randomly generated number
        with a maximum returned value of 4 */
        int randomNum = rand.nextInt(5);

        String pictureLink = catPhotos[randomNum];
        System.out.println(randomNum);

        return pictureLink;
    }

    public static void main(String[] args){
        System.out.println(getPictureLink());

    }

}
