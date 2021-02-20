package kz.danke.patterns.creation.factory.simple;

public class Client {

    public static void main(String[] args) {
        Post news = PostFactory.createPost("blog");

        System.out.println(news);
    }
}
