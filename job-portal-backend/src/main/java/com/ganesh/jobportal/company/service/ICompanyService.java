package com.ganesh.jobportal.company.service;

import com.ganesh.jobportal.dto.CompanyDto;

import java.util.List;

public interface ICompanyService {

    List<CompanyDto> getAllCompanies();

    List<CompanyDto> getAllCompaniesForAdmin();

    void deleteCompanyById(Long id);

    boolean updateCompanyDetails(Long id, CompanyDto companyDto);

    boolean createCompany(CompanyDto companyDto);

}