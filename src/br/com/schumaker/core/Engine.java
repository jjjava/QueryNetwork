package br.com.schumaker.core;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author hudson.sales
 */
public class Engine {

    public Engine() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 1; k <= 50; k++) {
                    Process p = null;
                    try {
                        p = Runtime.getRuntime().exec("ping " + get3partIp(getIpAdress()) + "." + k + " -n 1 -l 8");
                        InputStream in = p.getInputStream();
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(in));
                        String linha;
                        while ((linha = entrada.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    } finally {
                        p.destroy();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 51; k <= 100; k++) {
                    Process p = null;
                    try {
                        p = Runtime.getRuntime().exec("ping " + get3partIp(getIpAdress()) + "." + k + " -n 1 -l 8");
                        InputStream in = p.getInputStream();
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(in));
                        String linha;
                        while ((linha = entrada.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    } finally {
                        p.destroy();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 100; k <= 150; k++) {
                    Process p = null;
                    try {
                        p = Runtime.getRuntime().exec("ping " + get3partIp(getIpAdress()) + "." + k + " -n 1 -l 8");
                        InputStream in = p.getInputStream();
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(in));
                        String linha;
                        while ((linha = entrada.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    } finally {
                        p.destroy();
                    }
                }
            }
        }).start();
        
          new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 151; k <= 200; k++) {
                    Process p = null;
                    try {
                        p = Runtime.getRuntime().exec("ping " + get3partIp(getIpAdress()) + "." + k + " -n 1 -l 8");
                        InputStream in = p.getInputStream();
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(in));
                        String linha;
                        while ((linha = entrada.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    } finally {
                        p.destroy();
                    }
                }
            }
        }).start();
          
          new Thread(new Runnable() {
            @Override
            public void run() {
                for (int k = 200; k <= 254; k++) {
                    Process p = null;
                    try {
                        p = Runtime.getRuntime().exec("ping " + get3partIp(getIpAdress()) + "." + k + " -n 1 -l 8");
                        InputStream in = p.getInputStream();
                        BufferedReader entrada = new BufferedReader(new InputStreamReader(in));
                        String linha;
                        while ((linha = entrada.readLine()) != null) {
                            System.out.println(linha);
                        }
                    } catch (IOException e) {
                        System.out.println(e);
                    } finally {
                        p.destroy();
                    }
                }
            }
        }).start();


    }

    public String getIpAdress() {
        InetAddress ip = null;
        try {
            ip = InetAddress.getLocalHost();
        } catch (UnknownHostException ex) {
            System.err.println(ex);
        }
        System.out.println(ip.getHostAddress());
        return ip.getHostAddress();
    }

    public String get3partIp(String ip) {
        String aux[] = ip.split("\\.");
        String ip3 = aux[0] + "." + aux[1] + "." + aux[2];
        return ip3;
    }

    public String get2partIp(String ip) {
        String aux[] = ip.split("\\.");
        String ip2 = aux[0] + "." + aux[1];
        return ip2;
    }

    public String get1partIp(String ip) {
        String aux[] = ip.split("\\.");
        return aux[0];
    }
}
