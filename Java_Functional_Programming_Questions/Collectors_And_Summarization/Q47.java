package Java_Functional_Programming_Questions.Collectors_And_Summarization;

import java.util.*;
import java.util.stream.Collectors;

public class Q47 {
    public static void main(String[] args) {
        // Sample list of comments
        List<Comment> comments = Arrays.asList(
                new Comment("user1", "This is a comment."),
                new Comment("user2", "Another comment."),
                new Comment("user1", "Yet another comment."),
                new Comment("user3", "More comments."),
                new Comment("user2", "Comments keep coming."),
                new Comment("user1", "Last comment.")
        );

        // Count the number of comments by each user
        Map<String, Long> commentCountByUser = comments.stream()
                .collect(Collectors.groupingBy(Comment::getUser, Collectors.counting()));

        // Print the result
        commentCountByUser.forEach((user, count) ->
                System.out.println(user + " has " + count + " comments."));
    }
}

class Comment {
    private String user;
    private String text;

    public Comment(String user, String text) {
        this.user = user;
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public String getText() {
        return text;
    }
}
