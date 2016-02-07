package Module9;


import java.util.ArrayList;
import java.util.List;

public class Dir {

    private List<File> files = new ArrayList<>();

    public Dir() {
        files.add(new TextFile());
        files.add(new AudioFile());
        files.add(new ImageFile());
    }

    @Override
    public String toString() {

        String output = "Files in current dir are encrypted/decrypted  by Cesar Cipher: \n";

            for (File files : files) {
                output = output  +Encoder.encodeMechanism(files.getType(), 7) + "\t";
                output = output + Decoder.decodeMechanism(Encoder.encodeMechanism(files.getType(), 7), 7) + "\n";

        }

        return output;

    }
}

