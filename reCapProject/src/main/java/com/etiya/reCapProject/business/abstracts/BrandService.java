package com.etiya.reCapProject.business.abstracts;

import java.util.List;

import com.etiya.reCapProject.core.utilities.results.DataResult;
import com.etiya.reCapProject.core.utilities.results.Result;
import com.etiya.reCapProject.entities.concrates.Brand;
import com.etiya.reCapProject.entities.request.AddBrandRequest;
import com.etiya.reCapProject.entities.request.UpdateBrandRequest;

public interface BrandService {
	
	
	DataResult<List<Brand>> getBybrandId(int brandId);

	DataResult<List<Brand>> getAll();

	Result add(AddBrandRequest addBrandRequest);

	Result update(UpdateBrandRequest updateBrandRequest);

	Result delete(int brandId);

}
