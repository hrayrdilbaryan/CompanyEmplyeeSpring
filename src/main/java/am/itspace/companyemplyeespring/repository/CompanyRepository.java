package am.itspace.companyemplyeespring.repository;

import am.itspace.companyemplyeespring.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}
