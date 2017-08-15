package com.mx.takeda.payroll.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.ReadOnly;
@ReadOnly
@Entity
@Table(name = "APPS.VW_MX_EMPLOYEE_TBL")
@NamedQueries({
    @NamedQuery(name = "EmpOracle.findAll", query = "SELECT T FROM EmployeeOracle T where T.employee_id =:condition ORDER BY T.last_update_entry_dt DESC"),
    @NamedQuery(name = "EmpOracle.findByIdOracle", query = "SELECT T FROM EmployeeOracle T where T.employee_id =:condition ORDER BY T.last_update_entry_dt DESC"),
    @NamedQuery(name = "EmpOracle.findByIdWD", query = "SELECT T FROM EmployeeOracle T where T.identification_nbr =:condition ORDER BY T.last_update_entry_dt DESC")
})
public class EmployeeOracle implements Serializable {
	private static final long serialVersionUID = -6017524796761597612L;
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
	private String status_change_entry_dt;
	private String last_update_entry_dt;
	private String position_id;
	private String organization_nm;
	private String employee_typ;
	private String location_nm;
	private String job_profile_nm;
	private String comp_grade_id;
	private String employee_category;
	private String base_sal_frequency;
	private String eff_from_dt_asg;
	private String supervisor_id;
	private String prim_home_addr_line_1;
	private String prim_home_city_subdivision_1;
	private String prim_home_region_subdivision_1;
	private String prim_home_postal_cd;
	private String prim_home_city;
	private String prim_home_region;
	private String prim_home_country_alpha_2_cd;
	private String eff_from_dt_adr;
	private String base_sal_effdt;
	private String base_sal_amount;
	private String last_update_entry_dt_sal;
	private String company_nm;
	private String scheduled_wkly_hrs;
	private String status_change_entry_dt_sta;
	private String term_dt;
	private String last_work_dt;
	private String action_reason;
	private String lcl_term_rsn_id;
	private String status_change_entry_dt_ter;
	private String vm_log;
	private String status;
	private String created_by;
	private String last_update_date;
	private String last_updated_by;
	private String last_update_login;
	private String create_date;
	private String person_id;
	private String assignment_id;
	private String cost_center_org;
	private String comp_table_group;
	private String attribute10;
	private String request_id;
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
	public String getStatus_change_entry_dt() {
		return status_change_entry_dt;
	}
	public void setStatus_change_entry_dt(String status_change_entry_dt) {
		this.status_change_entry_dt = status_change_entry_dt;
	}
	public String getLast_update_entry_dt() {
		return last_update_entry_dt;
	}
	public void setLast_update_entry_dt(String last_update_entry_dt) {
		this.last_update_entry_dt = last_update_entry_dt;
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
	public String getBase_sal_frequency() {
		return base_sal_frequency;
	}
	public void setBase_sal_frequency(String base_sal_frequency) {
		this.base_sal_frequency = base_sal_frequency;
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
	public String getBase_sal_effdt() {
		return base_sal_effdt;
	}
	public void setBase_sal_effdt(String base_sal_effdt) {
		this.base_sal_effdt = base_sal_effdt;
	}
	public String getBase_sal_amount() {
		return base_sal_amount;
	}
	public void setBase_sal_amount(String base_sal_amount) {
		this.base_sal_amount = base_sal_amount;
	}
	public String getLast_update_entry_dt_sal() {
		return last_update_entry_dt_sal;
	}
	public void setLast_update_entry_dt_sal(String last_update_entry_dt_sal) {
		this.last_update_entry_dt_sal = last_update_entry_dt_sal;
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
	public String getTerm_dt() {
		return term_dt;
	}
	public void setTerm_dt(String term_dt) {
		this.term_dt = term_dt;
	}
	public String getLast_work_dt() {
		return last_work_dt;
	}
	public void setLast_work_dt(String last_work_dt) {
		this.last_work_dt = last_work_dt;
	}
	public String getAction_reason() {
		return action_reason;
	}
	public void setAction_reason(String action_reason) {
		this.action_reason = action_reason;
	}
	public String getLcl_term_rsn_id() {
		return lcl_term_rsn_id;
	}
	public void setLcl_term_rsn_id(String lcl_term_rsn_id) {
		this.lcl_term_rsn_id = lcl_term_rsn_id;
	}
	public String getStatus_change_entry_dt_ter() {
		return status_change_entry_dt_ter;
	}
	public void setStatus_change_entry_dt_ter(String status_change_entry_dt_ter) {
		this.status_change_entry_dt_ter = status_change_entry_dt_ter;
	}
	public String getVm_log() {
		return vm_log;
	}
	public void setVm_log(String vm_log) {
		this.vm_log = vm_log;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getLast_update_date() {
		return last_update_date;
	}
	public void setLast_update_date(String last_update_date) {
		this.last_update_date = last_update_date;
	}
	public String getLast_updated_by() {
		return last_updated_by;
	}
	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}
	public String getLast_update_login() {
		return last_update_login;
	}
	public void setLast_update_login(String last_update_login) {
		this.last_update_login = last_update_login;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getPerson_id() {
		return person_id;
	}
	public void setPerson_id(String person_id) {
		this.person_id = person_id;
	}
	public String getAssignment_id() {
		return assignment_id;
	}
	public void setAssignment_id(String assignment_id) {
		this.assignment_id = assignment_id;
	}
	public String getCost_center_org() {
		return cost_center_org;
	}
	public void setCost_center_org(String cost_center_org) {
		this.cost_center_org = cost_center_org;
	}
	public String getComp_table_group() {
		return comp_table_group;
	}
	public void setComp_table_group(String comp_table_group) {
		this.comp_table_group = comp_table_group;
	}
	public String getAttribute10() {
		return attribute10;
	}
	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}
	public String getRequest_id() {
		return request_id;
	}
	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	public String getLgl_nm_middle_nm() {
		return lgl_nm_middle_nm;
	}
	public void setLgl_nm_middle_nm(String lgl_nm_middle_nm) {
		this.lgl_nm_middle_nm = lgl_nm_middle_nm;
	}
	
}
