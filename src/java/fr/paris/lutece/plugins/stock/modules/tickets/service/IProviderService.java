/*
 * Copyright (c) 2002-2014, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.stock.modules.tickets.service;

import fr.paris.lutece.plugins.stock.business.provider.ProviderFilter;
import fr.paris.lutece.plugins.stock.commons.ResultList;
import fr.paris.lutece.plugins.stock.commons.dao.PaginationProperties;
import fr.paris.lutece.plugins.stock.modules.tickets.business.PartnerDTO;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;


/**
 *
 * IProviderService
 *
 */
@Transactional
public interface IProviderService
{


    /**
     * Init this service
     */
    void init(  );


    /**
    * Modifies a provider
    * @param provider The provider to modify in database
    */
    void doSaveProvider( PartnerDTO provider );

    /**
    * Delete a provider
    * @param nIdProvider the identifier of the provider to delete
    */
    void doDeleteProvider( int nIdProvider );




	// /**
	// * Find all providers with products fetched
	// * @return the provider list
	// */
	//
	// List<Provider> findAllWithProducts( );
	//
	    /**
     * Find by filter.
     * 
     * @param filter the filter
     * @param paginationProperties the pagination properties
     * @return the provider list filtered
     */
    ResultList<PartnerDTO> findByFilter( ProviderFilter filter, PaginationProperties paginationProperties );

	/**
	 * Find by provider id with product fetched
	 * 
	 * @param nId
	 *            the provider id
	 * @return the provider
	 */
    PartnerDTO findByIdWithProducts( int nId );

    /**
     * Find by provider id
     * 
     * @param nId
     *            the provider id
     * @return the provider
     */
    PartnerDTO findById( int nId );
    
    /**
     * Return all provider
     * 
     * @return the list of provider
     */
    List<PartnerDTO> findAll( );
}
