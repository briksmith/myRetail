package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Product;
import model.ProductInfo;

@RestController
public class SearchController
{

	@RequestMapping("/products")
	public Product search(@RequestParam(value = "id", defaultValue = "-1") int id)
	{
		ProductInfo productInfo = QuerryDB.getProductInfoFromDB(id);
		return new Product(productInfo.getId(), productInfo.getName(), productInfo.getPrice(),
				productInfo.getCurrencyCode());
	}

}
