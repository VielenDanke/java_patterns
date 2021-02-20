package kz.danke.patterns.creation.factory.simple;

public class PostFactory {

    public static Post createPost(String type) {
        return switch (type) {
            case "blog" -> new BlogPost();
            case "news" -> new NewsPost();
            case "product" -> new ProductPost();
            default -> throw new IllegalArgumentException(
                    String.format("Unknown type %s", type)
            );
        };
    }
}
