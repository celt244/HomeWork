import java.io.*;

import static java.lang.System.console;

public class Main {

    private static final String DEFAULT_PATH = "D:\\tmp28";
    private static File currentDir = new File(DEFAULT_PATH);

    public static void main(String[] args) throws IOException {

//mkFile("test.txt");
//delete(currentDir, "test.txt");
//        openTextFile("test.txt");
        console("test.txt");

    }


    // 1) Реализовать метод создания нового файла в текущей директории. - mkFile [fileName]

    public static void mkFile(String fileName) {

        File file = new File(currentDir, fileName);

        if (file.exists()) {
            System.out.println("File " + fileName + " has already been created earlier!");
        } else {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 2) Реализовать метод удаления файла/директории в текущей директории. - delete [folderName/fileName]

    public static void delete(File folderName, String fileName) {
        File file = new File(folderName, fileName);
        if (!file.exists()) {
            System.out.println("The specified directory is not the specified file!");
        } else if (file.isDirectory()) {
            file.delete();
            System.out.println("The folder and its contents removed!");
        } else {
            file.delete();
            System.out.println("The file removed!");

        }
    }

    // 3) Реализовать операцию open. Данная операция должна давать возможность отобразить содержимое
    // текстового файла в консоль. Для этого реализовать метод openTextFile(), который будет позволять
    // выводить на экран файлы с расширением [txt, csv]. - open [fileName.txt]

    public static void openTextFile(String fileName) throws IOException {
        File file = new File(currentDir, fileName);

        String extension = fileName.substring(fileName.lastIndexOf("."));

        if (!(extension.equals(".txt") || extension.equals(".csv")))
            System.out.println("The application does not support the file extension\n");
        else {
            if (!file.exists())
                System.out.println("The specified file was not found");

            InputStream input = new FileInputStream(file);
            int data = -1;
            while ((data = input.read()) >= 0)
                System.out.print((char) data);
        }


    }



    private static void console(String s) throws IOException {
        File file  = new File(currentDir, s);

        InputStream input = new FileInputStream(file);
        int data = -1;
        while ((data = input.read()) >= 0)
            System.out.print((char) data);
        input.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));

        while (true){
            String nextLine=reader.readLine();
            if(nextLine.equalsIgnoreCase("save")) break;
            writer.write(nextLine);
        }
        reader.close();
        writer.close();

        Writer writerInFile = new FileWriter(s);
        writerInFile.write(String.valueOf(writer));
        writerInFile.close();

    }


}
