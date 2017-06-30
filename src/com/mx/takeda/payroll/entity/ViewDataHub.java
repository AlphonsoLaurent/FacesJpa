package com.mx.takeda.payroll.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Vw_Mx_Hris_Employee")
public class ViewDataHub implements Serializable{
 
	private static final long serialVersionUID = 6370415491822362402L;
	@Id
	@Column(name = "EMPLOYEE_ID")
	private String employee_id;
	private String identification_nbr;
	private String lgl_nm_lst_nm;
	private String lgl_nm_first_nm;
	private String lgl_nm_2ndry_lst_nm;
	private String lgl_nm_title;
	private String gender;
	private String dt_of_birth;
	private String city_of_birth;
	private String country_region_nm;
	private String country;
	private String marital_status;
	private String nationality;
	private String hire_dt;
	private String curp;
	private String rfc;
	private String ssn;
	private String prim_work_email;
	private String status_change_entry_dt_per;
	private String last_update_entry_dt;
	private String load_dt_per;
	private String position_id;
	private String organization_nm;
	private String employee_typ;
	private String plan;
	private String location_nm;
	private String job_profile_nm;
	private String comp_grade_id;
	private String employee_category;
	private String salary_basis;
	private String eff_from_dt_asg;
	private String supervisor_id;
	private String cost_center_org_cd;
	private String load_dt_asg;
	private String prim_home_addr_line_1;
	private String prim_home_city_subdivision_1;
	private String prim_home_region_subdivision_1;
	private String prim_home_postal_cd;
	private String prim_home_city;
	private String prim_home_region;
	private String prim_home_country_alpha_2_cd;
	private String eff_from_dt_adr;
	private String load_dt_addr;
	private String base_sal_effdt;
	private String salary;
	private String status_change_entry_dt_sal;
	private String last_update_entry_dt_sal;
	private String load_dt_sal;
	private String company_nm;
	private String scheduled_wkly_hrs;
	private String status_change_entry_dt_sta;
	private String load_dt_sta;
	private String lgl_nm_middle_nm;
	public String getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}
	public String getIdentification_nbr() {
		return identification_nbr;
	}
	public void setIdentification_nbr(String identification_nbr) {
		this.identification_nbr = identification_nbr;
	}
	public String getLgl_nm_lst_nm() {
		return lgl_nm_lst_nm;
	}
	public void setLgl_nm_lst_nm(String lgl_nm_lst_nm) {
		this.lgl_nm_lst_nm = lgl_nm_lst_nm;
	}
	public String getLgl_nm_first_nm() {
		return lgl_nm_first_nm;
	}
	public void setLgl_nm_first_nm(String lgl_nm_first_nm) {
		this.lgl_nm_first_nm = lgl_nm_first_nm;
	}
	public String getLgl_nm_2ndry_lst_nm() {
		return lgl_nm_2ndry_lst_nm;
	}
	public void setLgl_nm_2ndry_lst_nm(String lgl_nm_2ndry_lst_nm) {
		this.lgl_nm_2ndry_lst_nm = lgl_nm_2ndry_lst_nm;
	}
	public String getLgl_nm_title() {
		return lgl_nm_title;
	}
	public void setLgl_nm_title(String lgl_nm_title) {
		this.lgl_nm_title = lgl_nm_title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDt_of_birth() {
		return dt_of_birth;
	}
	public void setDt_of_birth(String dt_of_birth) {
		this.dt_of_birth = dt_of_birth;
	}
	public String getCity_of_birth() {
		return city_of_birth;
	}
	public void setCity_of_birth(String city_of_birth) {
		this.city_of_birth = city_of_birth;
	}
	public String getCountry_region_nm() {
		return country_region_nm;
	}
	public void setCountry_region_nm(String country_region_nm) {
		this.country_region_nm = country_region_nm;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getHire_dt() {
		return hire_dt;
	}
	public void setHire_dt(String hire_dt) {
		this.hire_dt = hire_dt;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPrim_work_email() {
		return prim_work_email;
	}
	public void setPrim_work_email(String prim_work_email) {
		this.prim_work_email = prim_work_email;
	}
	public String getStatus_change_entry_dt_per() {
		return status_change_entry_dt_per;
	}
	public void setStatus_change_entry_dt_per(String status_change_entry_dt_per) {
		this.status_change_entry_dt_per = status_change_entry_dt_per;
	}
	public String getLast_update_entry_dt() {
		return last_update_entry_dt;
	}
	public void setLast_update_entry_dt(String last_update_entry_dt) {
		this.last_update_entry_dt = last_update_entry_dt;
	}
	public String getLoad_dt_per() {
		return load_dt_per;
	}
	public void setLoad_dt_per(String load_dt_per) {
		this.load_dt_per = load_dt_per;
	}
	public String getPosition_id() {
		return position_id;
	}
	public void setPosition_id(String position_id) {
		this.position_id = position_id;
	}
	public String getOrganization_nm() {
		return organization_nm;
	}
	public void setOrganization_nm(String organization_nm) {
		this.organization_nm = organization_nm;
	}
	public String getEmployee_typ() {
		return employee_typ;
	}
	public void setEmployee_typ(String employee_typ) {
		this.employee_typ = employee_typ;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getLocation_nm() {
		return location_nm;
	}
	public void setLocation_nm(String location_nm) {
		this.location_nm = location_nm;
	}
	public String getJob_profile_nm() {
		return job_profile_nm;
	}
	public void setJob_profile_nm(String job_profile_nm) {
		this.job_profile_nm = job_profile_nm;
	}
	public String getComp_grade_id() {
		return comp_grade_id;
	}
	public void setComp_grade_id(String comp_grade_id) {
		this.comp_grade_id = comp_grade_id;
	}
	public String getEmployee_category() {
		return employee_category;
	}
	public void setEmployee_category(String employee_category) {
		this.employee_category = employee_category;
	}
	public String getSalary_basis() {
		return salary_basis;
	}
	public void setSalary_basis(String salary_basis) {
		this.salary_basis = salary_basis;
	}
	public String getEff_from_dt_asg() {
		return eff_from_dt_asg;
	}
	public void setEff_from_dt_asg(String eff_from_dt_asg) {
		this.eff_from_dt_asg = eff_from_dt_asg;
	}
	public String getSupervisor_id() {
		return supervisor_id;
	}
	public void setSupervisor_id(String supervisor_id) {
		this.supervisor_id = supervisor_id;
	}
	public String getCost_center_org_cd() {
		return cost_center_org_cd;
	}
	public void setCost_center_org_cd(String cost_center_org_cd) {
		this.cost_center_org_cd = cost_center_org_cd;
	}
	public String getLoad_dt_asg() {
		return load_dt_asg;
	}
	public void setLoad_dt_asg(String load_dt_asg) {
		this.load_dt_asg = load_dt_asg;
	}
	public String getPrim_home_addr_line_1() {
		return prim_home_addr_line_1;
	}
	public void setPrim_home_addr_line_1(String prim_home_addr_line_1) {
		this.prim_home_addr_line_1 = prim_home_addr_line_1;
	}
	public String getPrim_home_city_subdivision_1() {
		return prim_home_city_subdivision_1;
	}
	public void setPrim_home_city_subdivision_1(String prim_home_city_subdivision_1) {
		this.prim_home_city_subdivision_1 = prim_home_city_subdivision_1;
	}
	public String getPrim_home_region_subdivision_1() {
		return prim_home_region_subdivision_1;
	}
	public void setPrim_home_region_subdivision_1(String prim_home_region_subdivision_1) {
		this.prim_home_region_subdivision_1 = prim_home_region_subdivision_1;
	}
	public String getPrim_home_postal_cd() {
		return prim_home_postal_cd;
	}
	public void setPrim_home_postal_cd(String prim_home_postal_cd) {
		this.prim_home_postal_cd = prim_home_postal_cd;
	}
	public String getPrim_home_city() {
		return prim_home_city;
	}
	public void setPrim_home_city(String prim_home_city) {
		this.prim_home_city = prim_home_city;
	}
	public String getPrim_home_region() {
		return prim_home_region;
	}
	public void setPrim_home_region(String prim_home_region) {
		this.prim_home_region = prim_home_region;
	}
	public String getPrim_home_country_alpha_2_cd() {
		return prim_home_country_alpha_2_cd;
	}
	public void setPrim_home_country_alpha_2_cd(String prim_home_country_alpha_2_cd) {
		this.prim_home_country_alpha_2_cd = prim_home_country_alpha_2_cd;
	}
	public String getEff_from_dt_adr() {
		return eff_from_dt_adr;
	}
	public void setEff_from_dt_adr(String eff_from_dt_adr) {
		this.eff_from_dt_adr = eff_from_dt_adr;
	}
	public String getLoad_dt_addr() {
		return load_dt_addr;
	}
	public void setLoad_dt_addr(String load_dt_addr) {
		this.load_dt_addr = load_dt_addr;
	}
	public String getBase_sal_effdt() {
		return base_sal_effdt;
	}
	public void setBase_sal_effdt(String base_sal_effdt) {
		this.base_sal_effdt = base_sal_effdt;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getStatus_change_entry_dt_sal() {
		return status_change_entry_dt_sal;
	}
	public void setStatus_change_entry_dt_sal(String status_change_entry_dt_sal) {
		this.status_change_entry_dt_sal = status_change_entry_dt_sal;
	}
	public String getLast_update_entry_dt_sal() {
		return last_update_entry_dt_sal;
	}
	public void setLast_update_entry_dt_sal(String last_update_entry_dt_sal) {
		this.last_update_entry_dt_sal = last_update_entry_dt_sal;
	}
	public String getLoad_dt_sal() {
		return load_dt_sal;
	}
	public void setLoad_dt_sal(String load_dt_sal) {
		this.load_dt_sal = load_dt_sal;
	}
	public String getCompany_nm() {
		return company_nm;
	}
	public void setCompany_nm(String company_nm) {
		this.company_nm = company_nm;
	}
	public String getScheduled_wkly_hrs() {
		return scheduled_wkly_hrs;
	}
	public void setScheduled_wkly_hrs(String scheduled_wkly_hrs) {
		this.scheduled_wkly_hrs = scheduled_wkly_hrs;
	}
	public String getStatus_change_entry_dt_sta() {
		return status_change_entry_dt_sta;
	}
	public void setStatus_change_entry_dt_sta(String status_change_entry_dt_sta) {
		this.status_change_entry_dt_sta = status_change_entry_dt_sta;
	}
	public String getLoad_dt_sta() {
		return load_dt_sta;
	}
	public void setLoad_dt_sta(String load_dt_sta) {
		this.load_dt_sta = load_dt_sta;
	}
	public String getLgl_nm_middle_nm() {
		return lgl_nm_middle_nm;
	}
	public void setLgl_nm_middle_nm(String lgl_nm_middle_nm) {
		this.lgl_nm_middle_nm = lgl_nm_middle_nm;
	} 
}
