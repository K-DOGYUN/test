package web.shoppingmall.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import web.shoppingmall.domain.categoryVO;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class mapperTest {
 	@Setter(onMethod_ = @Autowired)
	private includesMapper mapper;
	
	@Test
	public void testMapper() {
		categoryVO vo = new categoryVO();
				
		mapper.readLargeCategory();
		mapper.readMediumCategory("가공식품");
		mapper.readSmallCategory("건강식품");
		mapper.readDetailCategory("건강기능식품");
	}
}
