package chapter8;

public class GIFImage implements BrowserAPI {
    @Override
    public void browserImage(String filepath) {
        System.out.println("浏览"+filepath+"的gif图片");
    }
}
