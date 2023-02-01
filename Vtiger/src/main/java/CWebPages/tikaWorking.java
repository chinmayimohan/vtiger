package CWebPages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.pdf.PDFParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

public class tikaWorking {
public static void main(String[] args) throws IOException, SAXException, TikaException {
	BodyContentHandler ContentHandler=new BodyContentHandler();
	FileInputStream fis=new FileInputStream("./testdata/intro.pdf");
	Metadata metadata=new Metadata();
	ParseContext parsecontext=new ParseContext();
	PDFParser parser=new PDFParser();
	parser.parse(fis, ContentHandler, metadata, parsecontext);
	System.out.println(ContentHandler.toString());
}
}
