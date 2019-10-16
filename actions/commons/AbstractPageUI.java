package commons;

public class AbstractPageUI {

	// Dynamic locator for List jobchat on left side bar, include: My Job, My Chat,
	// Project Conversation, Group Conversation, Individual Conversation
	public static final String DYNAMIC_LIST_CHATJOB = "//div[@class='li-wapper']//span[contains(@class,'name') and contains(text(),'%s')]";

	public static final String DYNAMIC_KANBAN_PROJECT = "//span[@class='sub-text name' and contains(text(),'%s')]"
			+ "/parent::div//following-sibling::span[@class='op__menu']"
			+ "/span[@title='Go to project (Kanban)' or @title='Đi đến dự án (dưới dạng kanban)']";
	public static final String DYNAMIC_LISTVIEW_PROJECT = "//span[@class='sub-text name' and contains(text(),'%s')]"
			+ "/parent::div//following-sibling::span[@class='op__menu']"
			+ "/span[@title='Go to project (List view)' or @title='Đi đến dự án (dưới dạng bảng)']";
	// Kanban
	public static final String DYNAMIC_TASK = "//h4[contains(text(),'%s')]";
	public static final String DYNAMIC_OPTION_TASK = "//h4[text()='%s']//preceding-sibling::a";
	public static final String DYNAMIC_OPTION_TASK_DUPLICATE = "//h4[text()='%s']//preceding-sibling::a//ul/li[text()='Tạo bản sao' or text()='Duplicate task']";
	public static final String DYNAMIC_OPTION_TASK_DELETE = "//h4[text()='%s']//preceding-sibling::a//ul/li[text()='Delete' or text()='Xóa']";

	public static final String DYNAMIC_COLUMN = "//h3[contains(text(),'%s')]";

	public static final String DYNAMIC_OPTION_COLUMN = "//h3[contains(text(),'%s')]//following-sibling::a";
	public static final String DYNAMIC_OPTION_COLUMN_EDIT = "//h3[contains(text(),'%s')]//following-sibling::a//li[contains(text(),'Chỉnh sửa') or contains(text(),'Edit')]";
	public static final String DYNAMIC_OPTION_COLUMN_DELETE = "//h3[contains(text(),'%s')]//following-sibling::a//li[contains(text(),'Xóa') or contains(text(),'Delete')]";
	public static final String DYNAMIC_ADD_TASK_IN_COLUMN = "//h3[contains(text(),'%s')]//parent::header//following-sibling::div[@class='new-task follow-column']/a/img";
	
	//Task Detail
	public static final String DYNAMIC_ICON_IN_HEADER_TASK_DETAIL = "//ul[@class='list-icon clearfix']//li[@data-title='%s' or @data-title='%s']";

	//a[@id='send-email']
	public static final String DYNAMIC_ICON_MOVE_COLUMN = "//h3[contains(text(),'%s')]//preceding-sibling::span";
	public static final String DYNAMIC_COUNT_TASK_IN_COLUMN = "//h3[contains(text(),'%s')]//preceding-sibling::p";
	// View List
	public static final String DYNAMIC_MARKDONE_WORKING_GROUP = "//span[@class='sub-text' and text()='%s']//ancestor::div[@class='flex-cols']"
			+ "//following-sibling::div//i[@class='fa fa-check-circle ic-mark-done-working-group']";
	public static final String DYNAMIC_UNMARKDONE_WORKING_GROUP = "//span[@class='sub-text' and text()='%s']//ancestor::div[@class='flex-cols']"
			+ "//following-sibling::div//i[@class='fa fa-check-circle ic-mark-done-working-group check__active']";
	public static final String DYNAMIC_COLLAPSE_EXPAND_WORKING_GROUP = "//span[@class='sub-text' and text()='%s']//ancestor::div[@class='flex-cols']"
			+ "//following-sibling::div[@class='working-group__option']/span";
	public static final String DYNAMIC_DELETE_WORKING_GROUP ="//span[@class='sub-text' and text()='67']//ancestor::div[@class='flex-cols']//following-sibling::div[@class='working-group__option']/*[1]";
	public static final String DYNAMIC_MARKDONE_TASK_IN_WORKING_GROUP = "//span[@class='task-title sub-text' and text()='%s']//parent::div"
			+ "//following-sibling::div[@class='flex-cols pointer']//i[@class='fa fa-check-circle']";
	public static final String DYNAMIC_UNMARKDONE_TASK_IN_WORKING_GROUP = "//span[@class='task-title sub-text' and text()='Tyygh']//parent::div"
			+ "//following-sibling::div[@class='flex-cols pointer']//i[@class='fa fa-check-circle check__active']";
	public static final String DYNAMIC_DROPDOWN_FILTER_TASK_VALUE = "//div[@class='flex-cols options-default options-filter fweight-bolder']//li[contains(text(),'%s') or contains(text(),'%s')]";
	//public static final String DYNAMIC_DROPDOWN_FILTER_TASK = "//div[@class='flex-rows flex-rows__title boder-hover__none']/*[1]";
}
