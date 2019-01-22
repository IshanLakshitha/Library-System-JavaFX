package com.ijse.sys.business.custom.impl;

import com.ijse.sys.business.Converter;
import com.ijse.sys.business.custom.ManageIssueBooksBO;
import com.ijse.sys.dao.DAOFactory;
import com.ijse.sys.dao.custom.IssueBooksDAO;
import com.ijse.sys.dto.IssueBooksDTO;

import java.sql.SQLException;
import java.util.List;

public class ManageIssueBooksBOImpl implements ManageIssueBooksBO {

    private IssueBooksDAO issueBooksDAO;

    public ManageIssueBooksBOImpl() {
        issueBooksDAO = DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ISSUEBOOKS);
    }

    public List<IssueBooksDTO> getIssueBooks() throws SQLException {
        return issueBooksDAO.findAll().map(Converter::<IssueBooksDTO>getDTOList).get();
    }

    public boolean createIssueBooks(IssueBooksDTO dto) throws SQLException {
        return issueBooksDAO.save(Converter.getEntity(dto));
    }

    public boolean updateIssueBooks(IssueBooksDTO dto) throws SQLException {
        return issueBooksDAO.update(Converter.getEntity(dto));
    }

    public boolean deleteIssueBooks(String code) throws SQLException {
        return issueBooksDAO.delete(code);
    }

    public IssueBooksDTO findIssueBooks(String bookID) throws SQLException {
        return issueBooksDAO.find(bookID).map(Converter::<IssueBooksDTO>getDTO).orElse(null);
    }
}
