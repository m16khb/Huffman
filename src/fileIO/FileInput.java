package fileIO;

import java.io.FileInputStream;

public class FileInput {
    public byte[] getData(String path) {
        try {
            // 바이트 단위로 파일읽기
            String filePath = path; // 대상 파일
            FileInputStream fileStream = null; // 파일 스트림

            fileStream = new FileInputStream(filePath);// 파일 스트림 생성
            //버퍼 선언
            byte[] readBuffer = new byte[fileStream.available()];
            while (fileStream.read(readBuffer) != -1) {
            }

            fileStream.close(); //스트림 닫기
            return readBuffer;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return null;
    }
}

