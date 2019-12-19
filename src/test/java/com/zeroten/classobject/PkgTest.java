package com.zeroten.classobject;

import org.testng.annotations.Test;
import java.util.*;

public class PkgTest {
    @Test
    public void testPkg(){
        Date date = new Date();
        System.out.println(date.toString());
        int[] nums1 = new int[3];
        int[] nums2 = new int[] {1,2,3};
        int[] nums3 = {1,2,3};
        System.out.println(Arrays.toString(nums3));
    }
}
