package com.example.QR_code;


	import com.google.zxing.BarcodeFormat;
	import com.google.zxing.MultiFormatWriter;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
	import com.google.zxing.qrcode.QRCodeWriter;
	import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

	import java.io.File;
	import java.io.IOException;

	public class QRCodeGenerater {
	    private static final String QR_CODE_IMAGE_PATH = "./QRCode.png";

	    public static void main(String[] args) {
	        String textToEncode = "https://www.example.com";

	        try {
	            BitMatrix bitMatrix = new MultiFormatWriter().encode(textToEncode, BarcodeFormat.QR_CODE, 200, 200);
	            QRCodeWriter qrCodeWriter = new QRCodeWriter();
	            bitMatrix = qrCodeWriter.encode(textToEncode, BarcodeFormat.QR_CODE, 200, 200);
	            File qrCodeFile = new File(QR_CODE_IMAGE_PATH);
	            MatrixToImageWriter.writeToFile(bitMatrix, "PNG", qrCodeFile);
	            System.out.println("QR code generated successfully.");
	        } catch (Exception e) {
	            System.err.println("Error generating QR code: " + e.getMessage());
	        }
	    }
	}



