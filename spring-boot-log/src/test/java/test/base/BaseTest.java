package test.base;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.lxzl.bean.DocInfoBean;
import com.lxzl.bean.ProjectInfoBean;
import com.lxzl.bean.WorkBean;
import com.lxzl.bean.WorkspaceInfoBean;
import com.lxzl.jaxb.Marshal;

public class BaseTest {

	@Test
	public void test() {
		Marshal<WorkBean> marshal = new Marshal<>();
		
		WorkBean workBean = new WorkBean();
		workBean.setName("test");
		
		List<ProjectInfoBean> projectList = new ArrayList<>();
		
		ProjectInfoBean projectInfoBean = new ProjectInfoBean();
		projectInfoBean.setName("test");
		projectInfoBean.setType("type");
		projectInfoBean.setDocInfo(new DocInfoBean());
		projectInfoBean.setWorkspaceInfo(new WorkspaceInfoBean());
		projectList.add(projectInfoBean);
		projectInfoBean = new ProjectInfoBean();
		projectInfoBean.setName("test");
		projectList.add(projectInfoBean);
		projectInfoBean = new ProjectInfoBean();
		projectInfoBean.setName("test");
		projectList.add(projectInfoBean);
		
		
		workBean.setProjectList(projectList);
		
		
		marshal.start(new File("C:\\wnn\\test.xml"), workBean);
		
	}

}
