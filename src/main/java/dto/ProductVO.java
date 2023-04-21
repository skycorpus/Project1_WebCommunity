package dto;

public class ProductVO {
	private Integer code;
	private String name;
	private Integer price;
	private String description;
	private String pictureUrl;
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public Integer getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the pictureUrl
	 */
	public String getPictureUrl() {
		return pictureUrl;
	}
	/**
	 * @param pictureUrl the pictureUrl to set
	 */
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
}
