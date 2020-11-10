package com.example.controller.job;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Job;
import com.example.service.job.EnService;

/**
 * ユーザーのログイン時のコントローラー.
 * 
 * @author oyamadakenji
 *
 */
@Controller
@RequestMapping("/job-list")
public class JobListController {

	@Autowired
	private EnService enService;
	
	/**
	 * 求人一覧画面へ.
	 * 
	 * @return 求人一覧
	 */
	@RequestMapping("/to-job-list")
	public String toJobList(Integer siteNumber,Integer codingLanguageNumber, Model model) {
		
		System.out.println(siteNumber);
		System.out.println(codingLanguageNumber);
		
		List<Job> jobList = null;
		
		if(Objects.isNull(siteNumber)) {
			siteNumber = 1;
		}

		if(Objects.isNull(codingLanguageNumber)) {
			codingLanguageNumber = 1;
		}
		
		String codingLanguage = null;
		switch (codingLanguageNumber){
		  case 1:
			  codingLanguage = "Java";
			  break;
		  case 2:
			  codingLanguage = "Ruby";
			  break;
		  case 3:
			  codingLanguage = "PHP";
			  break;
		  case 4:
			  codingLanguage = "C++";
			  break;
		  case 5:
			  codingLanguage = "C#";
			  break;
		  case 6:
			  codingLanguage = "COBOL";
			  break;
		  case 7:
			  codingLanguage = "Go";
			  break;
		  case 8:
			  codingLanguage = "Kotlin";
			  break;
		  case 9:
			  codingLanguage = "Perl";
			  break;
		  case 10:
			  codingLanguage = "Python";
			  break;
		  case 11:
			  codingLanguage = "R";
			  break;
		  case 12:
			  codingLanguage = "Scala";
			  break;
		  case 13:
			  codingLanguage = "Swift";
			  break;
		  case 14:
			  codingLanguage = "TypeScript";
			  break;
		}

		switch (siteNumber){
		  case 1:
			  jobList = enService.searchJob(codingLanguage);
			  break;
		  case 2:
			  System.out.println("2");
			  break;
		  case 3:
			  System.out.println("3");
			  break;
		  case 4:
			    System.out.println("4");
			    break;
		  case 5:
				System.out.println("5");
				break;
		  case 6:
				System.out.println("6");
				break;
		  case 7:
			    System.out.println("7");
			    break;
		  case 8:
			    System.out.println("8");
			    break;
		}
		
	    model.addAttribute("jobList",jobList);
		return "job/job_list";
	}	
}
