package awsdeploy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AwsDeployController {

	@GetMapping("/index")
	public String getIndex() {
		// "/index": jarファイルで実行するとTemplateInputExceptionが発動する
		// "index" : 最初の'/'を消す
		return "index";
	}
}
