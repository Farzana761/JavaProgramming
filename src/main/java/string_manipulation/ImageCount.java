package string_manipulation;
//Find out how many images are in the given array:
//        Input: ["photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"]
//        Output: 3
public class ImageCount {
    public static void main(String[] args) {
        String[] photoArray = {"photo1.jpg", "doc1.pdf", "doc2.docx", "photo2.png", "doc3.pdf", "msoffice.exe", "photo3.jpg"};

        int count = 0;

        for (String result : photoArray) {
            if (result.contains(".jpg") || result.contains(".png")) {
                count += 1;
            }
        }
        System.out.println("your photo is: " + count);
    }
}
