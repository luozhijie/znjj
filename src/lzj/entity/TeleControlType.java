package lzj.entity;

public class TeleControlType {
	private int teleControlTypeId;
	private String teltControlTypeName;

	public TeleControlType() {
		super();
	}

	public TeleControlType(int teleControlTypeId, String teltControlTypeName) {
		super();
		this.teleControlTypeId = teleControlTypeId;
		this.teltControlTypeName = teltControlTypeName;
	}

	public int getTeleControlTypeId() {
		return teleControlTypeId;
	}

	public void setTeleControlTypeId(int teleControlTypeId) {
		this.teleControlTypeId = teleControlTypeId;
	}

	public String getTeltControlTypeName() {
		return teltControlTypeName;
	}

	public void setTeltControlTypeName(String teltControlTypeName) {
		this.teltControlTypeName = teltControlTypeName;
	}

	@Override
	public String toString() {
		return "TeleControlType [teleControlTypeId=" + teleControlTypeId + ", teltControlTypeName="
				+ teltControlTypeName + "]";
	}

}
