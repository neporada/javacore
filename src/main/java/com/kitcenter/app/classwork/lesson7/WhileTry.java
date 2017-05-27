package com.kitcenter.app.classwork.lesson7;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

/**
 * Created by denis on 5/27/17.
 */
public class WhileTry {

    public void whileTryTwice() {
        System.out.println("Put any two numbers & press \'Enter\' ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int expOut;
        do {
            expOut = a - 1;
        } while (a > b);
        System.out.println("a =" + expOut + "  b =" + b);
    }
}
