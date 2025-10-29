package Day1toDay14.Day12;
import org.monte.media.Format;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;

import java.awt.*;
import java.io.File;

import static org.monte.media.FormatKeys.*;
import static org.monte.media.VideoFormatKeys.*;
public class RecordingUtility {
    static ScreenRecorder recorder;

    // Start Recording
    public static void startRecording() throws Exception {
        GraphicsConfiguration gc = GraphicsEnvironment
                .getLocalGraphicsEnvironment()
                .getDefaultScreenDevice()
                .getDefaultConfiguration();

        Rectangle captureSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        File outDir = new File("C:\\STAD Solutions\\Practice\\Selenium_Stad\\recording");
        outDir.mkdirs(); // create directory if not exists

        recorder = new ScreenRecorder(gc, captureSize,
                new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
                        DepthKey, 24, FrameRateKey, Rational.valueOf(15),
                        QualityKey, 1.0f, KeyFrameIntervalKey, 15 * 60),
                new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, "black",
                        FrameRateKey, Rational.valueOf(30)),
                null, outDir);

        recorder.start();
    }

    // Stop Recording
    public static void stopRecording() throws Exception {
        if (recorder != null)
            recorder.stop();
    }
}


