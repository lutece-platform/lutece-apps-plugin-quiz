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
package fr.paris.lutece.plugins.quiz.business;

/**
 * This class represents business object Quiz profile
 */
public class QuizProfile
{
    private int _nIdProfile;

    private String _strName;

    private String _strDescription;

    private int _nIdQuiz;

    /**
     * Get the id of the profile
     * @return The id of the profile
     */
    public int getIdProfile( )
    {
        return _nIdProfile;
    }

    /**
     * Set the id of the profile
     * @param nIdProfile The id of the profile
     */
    public void setIdProfile( int nIdProfile )
    {
        this._nIdProfile = nIdProfile;
    }

    /**
     * @return the _strName
     */
    public String getName( )
    {
        return _strName;
    }

    /**
     * @param strName the _strName to set
     */
    public void setName( String strName )
    {
        this._strName = strName;
    }

    /**
     * @return the _strDescription
     */
    public String getDescription( )
    {
        return _strDescription;
    }

    /**
     * @param strDescription the _strDescription to set
     */
    public void setDescription( String strDescription )
    {
        this._strDescription = strDescription;
    }

    /**
     * @return the _nIdQuiz
     */
    public int getIdQuiz( )
    {
        return _nIdQuiz;
    }

    /**
     * @param nIdQuiz the _nIdQuiz to set
     */
    public void setIdQuiz( int nIdQuiz )
    {
        this._nIdQuiz = nIdQuiz;
    }

}
