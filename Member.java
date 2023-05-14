
public class Member {

	private String Bname,auther,Bdep,publisher,volume,Bprice,Studname,idcard,dueamt,fineamt,booksIssued,booksReturned;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String bname, String auther, String bdep, String publisher, String volume, String bprice,
			String studname, String idcard, String dueamt, String fineamt, String booksissued, String booksreturned) {
		super();
		this.Bname = bname;
		this.auther = auther;
		this.Bdep = bdep;
		this.publisher = publisher;
		this.volume = volume;
		this.Bprice = bprice;
		this.Studname = studname;
		this.idcard = idcard;
		this.dueamt = dueamt;
		this.fineamt = fineamt;
		this.booksIssued = booksissued;
		this.booksReturned = booksreturned;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getBdep() {
		return Bdep;
	}

	public void setBdep(String bdep) {
		Bdep = bdep;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getBprice() {
		return Bprice;
	}

	public void setBprice(String bprice) {
		Bprice = bprice;
	}

	public String getStudname() {
		return Studname;
	}

	public void setStudname(String studname) {
		Studname = studname;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getDueamt() {
		return dueamt;
	}

	public void setDueamt(String dueamt) {
		this.dueamt = dueamt;
	}

	public String getFineamt() {
		return fineamt;
	}

	public void setFineamt(String fineamt) {
		this.fineamt = fineamt;
	}

	public String getBooksIssued() {
		return booksIssued;
	}

	public void setBooksIssued(String booksissued) {
		this.booksIssued = booksissued;
	}

	public String getBooksReturned() {
		return booksReturned;
	}

	public void setBooksReturned(String booksreturned) {
		this.booksReturned = booksreturned;
	}

}
