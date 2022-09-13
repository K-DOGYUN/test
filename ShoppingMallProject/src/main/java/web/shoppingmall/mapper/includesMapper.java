package web.shoppingmall.mapper;

import java.util.List;

import web.shoppingmall.domain.categoryVO;

public interface includesMapper {
	public List<String> readLargeCategory();
	public List<String> readMediumCategory(String largeCategory);
	public List<String> readSmallCategory(String MediumCategory);
	public List<String> readDetailCategory(String SmallCategory);
}
