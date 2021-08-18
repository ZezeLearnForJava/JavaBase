package com.zeze.threadlocal;

import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private  static Service service = new Service();
    public static void main(String[] args) {

        String command = "sudo firewall-cmd a %s b %s";

        String sudo = "sudo firewall-cmd a 10.1.1.1 b 1.1.1.1";
        System.out.println(sudo.contains(command.substring(0, "sudo firewall-cmd a".length()))); //false
    }

    static class SiteNode {

        private Site site;

        public SiteNode(Site site) {
            this.site = site;
        }
        public Site getSite() {
            return site;
        }

        public void setSite(Site site) {
            this.site = site;
        }
    }
    static class Site {
        String ip;
        String eip;

        public Site(String ip, String eip) {
            this.ip = ip;
            this.eip = eip;
        }
        public void setIp(String ip) {
            this.ip = ip;
        }
        public String getIp () {
            return ip;
        }

        public String getEip() {
            return eip;
        }

        public void setEip(String eip) {
            this.eip = eip;
        }
    }
}
