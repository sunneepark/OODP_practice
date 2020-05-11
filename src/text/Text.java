package text;

class TextObj {
    String text;
    String author;
    int length;
    
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}

public class Text {
	TextObj TextObj;
    
    /*methods that change the text*/
    void allLettersToUpperCase() {}
    void findSubTextAndDelete(String s) {}
    /*method for formatting output*/
    void printText() {}
}
