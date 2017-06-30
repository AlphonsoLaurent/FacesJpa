package com.mx.takeda.payroll.bussines;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.mx.takeda.payroll.entity.ViewDataHub;

/**
 * Session Bean implementation class EmployesViewDataHubFacade
 */
@Stateless
@LocalBean
public class EmployesViewDataHubFacade implements EmployesViewDataHubFacadeLocal {
	@PersistenceContext(unitName = "payroll")
	private EntityManager em;
	private static final Logger LOG = Logger.getLogger(EmployesViewDataHubFacade.class.getName());

	public EmployesViewDataHubFacade() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public ViewDataHub[] getListDataHub() {
		ViewDataHub[] auctionList = null;
        try {
            TypedQuery<ViewDataHub> auctionQuery = em.createNamedQuery("Auction.findAll", ViewDataHub.class);
            List<ViewDataHub> auctions = auctionQuery.getResultList();
            auctionList = auctions.toArray(new ViewDataHub[0]);
        } catch (Exception e) {
            LOG.log(Level.SEVERE, e.getMessage());
        }

        return buildAuctionListView(auctionList);
	}
	private ViewDataHub[] buildAuctionListView(ViewDataHub[] viewDataHubList) {
		ViewDataHub[] viewDataHub= null; 
        return viewDataHub;
    }

	 
}
