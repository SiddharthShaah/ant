package com.ant.sysprops;

import java.util.Properties;

public class SysPropsTest {
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.forEach((k,v)->{
            System.out.println(k +" :" + v);
        });
    }
}
