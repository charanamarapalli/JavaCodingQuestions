package random;//package api;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//import java.util.function.Function;
//
//public class NewClass {
//
//    @Test
//    public void testApiResponseWithExpectedOutput() {
//
//        LocalTime currentTime = LocalTime.now();
//        int remainingSeconds = 60 - currentTime.getSecond();
//
//        long updatedSurveyEndTime = System.currentTimeMillis() + remainingSeconds * 1000;
//        DateFormat format = new SimpleDateFormat("EEE MMM dd yyyy HH:mm:ss");
//        String updateEndTimeStr = format.format(updatedSurveyEndTime);
//        System.out.println(updateEndTimeStr);
//
//
//
//
//
//        // Create your expected output list of 5 books
//        List<Book> expectedOutput = Arrays.asList(
//                new Book("Title 1", "Author 1"),
//                new Book("Title 2", "Author 2"),
//                new Book("Title 3", "Author 3"),
//                new Book("Title 4", "Author 4"),
//                new Book("Title 5", "Author 5")
//        );
//
//
//        List<Book> booksFromResponse = Arrays.asList(
//                new Book("Title 1", "Author 1"),
//                new Book("Title 2", "Author 2"),
//                new Book("Title 3", "Author 3"),
//                new Book("Title 4", "Author 4"),
//                new Book("Title 5", "Author 5"));
//
//        // Compare the books count and content using streams
//        Assert.assertEquals(booksFromResponse.size(), expectedOutput.size(), "Book count is not matching.");
//
//        boolean allBooksMatch = expectedOutput.stream()
//                .allMatch(expectedBook -> booksFromResponse.stream()
//                        .anyMatch(actualBook -> actualBook.getTitle().equals(expectedBook.getTitle()) &&
//                                actualBook.getAuthor().equals(expectedBook.getAuthor()))
//                );
//
//        final List<Book> expectedOutput1 = new ArrayList<>();
//
//
//
//
//    }
//
//
//
//
//}
