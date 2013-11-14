<#--

    =============================================================================

    ORCID (R) Open Source
    http://orcid.org

    Copyright (c) 2012-2013 ORCID, Inc.
    Licensed under an MIT-Style License (MIT)
    http://orcid.org/open-source-license

    This copyright and license information (including a link to the full license)
    shall be included in its entirety in all copies or substantial portion of
    the software.

    =============================================================================

-->

<#include "includes/affiliate/del_affiliate_inc.ftl"/>

<#include "includes/affiliate/add_affiliate_inc.ftl"/>
<div ng-controller="AffiliationCtrl">
	<div id="workspace-education" class="workspace-accordion-item workspace-accordion-active" >
		<div class="workspace-accordion-header"><a name='workspace-educations' />
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text">
		  		<i class="icon-caret-down icon" ng-class="{'icon-caret-right':displayAffiliations==false}"></i></a>
		   	</a> 
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text"><@orcid.msg 'org.orcid.jaxb.model.message.AffiliationType.education'/></a>
			<a href="" class="label btn-primary" ng-click="addAffiliationModal('education')"><@orcid.msg 'manual_affiliation_form_contents.add_education_manually'/></a>
		</div>
		<div ng-show="displayAffiliations" class="workspace-accordion-content">
			<#include "includes/affiliate/edu_body_inc.ftl" />
		</div>
	</div>	
	<div id="workspace-education" class="workspace-accordion-item workspace-accordion-active" >
		<div class="workspace-accordion-header"><a name='workspace-employments' />
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text">
		  		<i class="icon-caret-down icon" ng-class="{'icon-caret-right':displayAffiliations==false}"></i></a>
		   	</a> 
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text"><@orcid.msg 'org.orcid.jaxb.model.message.AffiliationType.employment'/></a>
			<a href="" class="label btn-primary" ng-click="addAffiliationModal('employment')"><@orcid.msg 'manual_affiliation_form_contents.add_employment_manually'/></a>
		</div>
		<div ng-show="displayAffiliations" class="workspace-accordion-content">
			<#include "includes/affiliate/emp_body_inc.ftl" />
		</div>
	</div>	
	<div ng-show='affiliationsSrvc.affiliations.length != 0' id="workspace-affiliations" class="workspace-accordion-item workspace-accordion-active" ng-cloak>
		<div class="workspace-accordion-header"><a name='workspace-affiliations' />
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text">
		  		<i class="icon-caret-down icon" ng-class="{'icon-caret-right':displayAffiliations==false}"></i></a>
		   	</a> 
		    <a href="" ng-click="toggleDisplayAffiliations()" class="toggle-text"><@orcid.msg 'workspace_bio.Affiliations'/></a>
			<a href="" class="label btn-primary" ng-click="addAffiliationModal()"><@orcid.msg 'manual_affiliation_form_contents.add_affiliation_manually'/></a>
		</div>
		<div ng-show="displayAffiliations" class="workspace-accordion-content">
			<#include "includes/affiliate/aff_body_inc.ftl" />
		</div>
	</div>
</div>
    