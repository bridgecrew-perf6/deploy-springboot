package awsdeploy.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import awsdeploy.Entity.Book;
import awsdeploy.Repository.BookRepository;

@Controller
public class AwsDeployController {
	
	@Autowired
	private BookRepository bookRepository;

	@GetMapping("/index")
	public String getIndex() {
		// "/index": jarファイルで実行するとTemplateInputExceptionが発動する
		// "index" : 最初の'/'を消す
		return "index";
	}
	
	@GetMapping("/save-book")
	public String saveBook(Model model) {
		Book book = new Book("テストブック");
		bookRepository.save(book);
		model.addAttribute("books", bookRepository.findAll());
		return "result";
	}
	
}
