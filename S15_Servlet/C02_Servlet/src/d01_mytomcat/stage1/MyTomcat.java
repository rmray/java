package d01_mytomcat.stage1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyTomcat {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);

        while (!serverSocket.isClosed()) {
            Socket socket = serverSocket.accept();

            // 1. 解析请求
            InputStream is = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is, "utf-8"));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                if(line.length() == 0) break;
                System.out.println(line);
            }

            // 2. 构建响应
            OutputStream os = socket.getOutputStream();
            String respHeader = """
                    HTTP/1.1 200 OK
                    Content-Type: text/html;charset=utf-8
                    
                    """;
            String resp = respHeader + "hi, Mr 劳伦斯!";
            os.write(resp.getBytes());

            os.close();
            bufferedReader.close();
            socket.close();
        }
    }
}
