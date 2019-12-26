package level3;

public class Monster {//�ϳ��� ����ü�� ��� ����ü
	
	private String monsterChooseImage;//���� ���� â ǥ�� �̹��� ����ü�� �����ϴ�
	private String monsterSelectedImage; // ������ ������������ ���� �̹���(�ܰ躰 ǥ��)
	private String gameImage;// �ش� ���� ���������� ǥ�� �̹���

	private String gameMusic;//�ش� ���� �������� �� ����

	private Integer hunger;//���
	private Integer obedience;//������
	private Integer health;//�ǰ�
	private Integer mental;//���Űǰ�
	private Integer day;
	private static Integer endingCondition= 1;//�ʱ� ��� 

	
	public String getMonsterSelectedImage() {
		//System.out.println(this.endingCondition);
		return monsterSelectedImage+endingCondition+".png";
	}
	public void setMonsterSelectedImage(String monsterSelectedImage) {
		this.monsterSelectedImage = monsterSelectedImage;
	}
	
	public Integer getEndingCondition() {
		return endingCondition;
	}
	public void setEndingCondition(Integer endingCondition) {
		this.endingCondition = endingCondition;
		//System.out.println(this.endingCondition);
	}
	
	public void initHunger(Integer hunger) {
		this.hunger = hunger;
	}
	public Integer getHunger() {
		return hunger;
	}
	public void setHunger(Integer hunger) {
		this.hunger -=hunger;
	}
	
	public void initObedience(Integer obedience) {
		this.obedience = obedience;
	}
	public Integer getObedience() {
		return obedience;
	}
	public void setObedience(Integer obedience) {
		this.obedience -= obedience;
	}
	
	public void initHealth(Integer health) {
		this.health = health;
	}
	public Integer getHealth() {
		return health;
	}
	public void setHealth(Integer health) {
		this.health -=health;
	}
	
	public void initMental(Integer mental) {
		this.mental = mental;
	}
	public Integer getMental() {
		return mental;
	}
	public void setMental(Integer mental) {
		this.mental -= mental;
	}
	
	public String getMonsterChooseImage() {
		return monsterChooseImage;
	}
	public void setMonsterChooseImage(String startImage) {
		this.monsterChooseImage = startImage;
	}
	public String getGameImage() {
		return gameImage;
	}
	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}


	public String getGameMusic() {
		return gameMusic;
	}
	public void setGameMusic(String gameMusic) {
		this.gameMusic = gameMusic;
	}
	
	public Monster(String monsterChooseImage, String gameImage, String gameMusic, String monsterSelectedImge) {
		super();
		this.monsterChooseImage = monsterChooseImage;
		this.gameImage = gameImage;
		this.gameMusic = gameMusic;
		this.monsterSelectedImage = monsterSelectedImge;
	}
	
	
}
