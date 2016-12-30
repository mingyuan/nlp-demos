package cn.mingyuan.nlp;

import cn.mingyuan.pullword.Pullword;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author jiangmingyuan@myhaowai.com
 * @version 2016/12/30 14:45
 * @since jdk1.8
 */
public class App {
    public static void main(String[] args) throws IOException {
        List<String> list = FileUtils.readLines(new File("data/titles.txt"), "utf8");

        long st = System.currentTimeMillis();
        for (String s : list) {
            String plainText = Pullword.getPlainText(s);
            System.out.println(plainText);
        }
        System.out.println("time=" + (System.currentTimeMillis() - st));
    }
}
