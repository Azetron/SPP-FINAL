package l3;




public class BookStatistics implements Visitor{
	
	 int Image=0;
	 int ImageProxy=0;
	 int Paragraph=0;
	 int Table=0;
	 int Section=0;
	
	
	
	public BookStatistics() {}
	public BookStatistics(int i,int ip,int p,int t) {
		this.Image=i;
		this.ImageProxy=ip;
		this.Paragraph=p;
		this.Table=t;
	}
	
	

	public int getImage() {
		return Image;
	}
	public void setImage(int image) {
		Image = image;
	}
	public int getImageProxy() {
		return ImageProxy;
	}
	public void setImageProxy(int imageProxy) {
		ImageProxy = imageProxy;
	}
	public int getParagraph() {
		return Paragraph;
	}
	public void setParagraph(int paragraph) {
		Paragraph = paragraph;
	}
	public int getTable() {
		return Table;
	}
	public void setTable(int table) {
		Table = table;
	}
	public int getSection() {
		return Section;
	}
	public void setSection(int section) {
		Section = section;
	}
	@Override
	public void visit(l3.Image i) {
		this.Image++;
		
	}
	@Override
	public void visit(l3.ImageProxy ip) {
		this.ImageProxy++;
		
	}
	@Override
	public void visit(l3.Paragraph p) {
		this.Paragraph++;
		
	}
	@Override
	public void visit(l3.Table t) {
		this.Table++;
		
	}
	@Override
	public void visit(Section s) {
		this.Section++;
		
	}
	public void printStatistics() {
		System.out.println("Book statistics:");
		System.out.println("Number of images: "+this.Image);
		System.out.println("Image proxy: "+this.ImageProxy);
		System.out.println("Number of paragraphs: "+this.Paragraph);
		System.out.println("Number of tables: "+this.Table);
	}
	
	
		
}
