package web.shoppingmall.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class categoryVO {
	private String categoryNumber;
	private String largeCategory;
	private String mediumCategory;
	private String smallCategory;
	private String detailCategory;
}
