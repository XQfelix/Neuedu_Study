package NeuBankSystem;

public class Bank {
/*创建一个银行类 属性有  卡号  账户  金额  
 *      实现 开户,存钱,取钱,转账*/
	
	private String CardId;
	private String CardName;
	private String CardPrice;
	
	
	public Bank(String CardId, String CardName, String CardPrice) {
		// TODO Auto-generated constructor stub
		this.CardId=CardId;
		this.CardName=CardName;
		this.CardPrice=CardPrice;
	}
	
	public String getCardId() {
		return CardId;
	}
	public void setCardId(String acountId) {
		CardId = acountId;
	}
	public String getCardName() {
		return CardName;
	}
	public void setCardName(String cardName) {
		CardName = cardName;
	}
	public String getCardPrice() {
		return CardPrice;
	}
	public void setCardPrice(String cardPrice) {
		CardPrice = cardPrice;
	}
	
}
