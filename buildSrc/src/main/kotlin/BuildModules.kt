object BuildModules {
    const val APP = ":app"
    const val CORE = ":core"

    object Features {
        const val SPLASH = ":features:splash"
        const val LOGIN = ":features:login"
        const val WALLET = ":features:wallet"
        const val PAYMENT = ":features:payment"
        const val TRANSACTIONS = ":features:transactions"
        const val HOME = ":features:home"
        const val NOTIFICATION = ":features:notification"
        const val PROPERTIES = ":features:properties"
        const val SERVICE_LIST = ":features:services"
        const val APPLICATIONS = ":features:applications"
        const val DIRECTORY = ":features:directory"
        const val MY_PROFILE = ":features:myprofile"
        const val CREATE_APPLICATION_BASE = ":features:application:base"
        const val ADD_COMPANY = ":features:application:addcompany"
        const val ADD_PMA = ":features:application:addpma"
        const val ADD_POA = ":features:application:addPoa"
        const val ADD_EMPLOYEE = ":features:application:addemployee"
        const val LEASE = ":features:application:lease"
        const val SELL_AND_PURCHASE = ":features:application:sellAndPurchase"
        const val APPLICATION_REVIEW = ":features:application:review"
        const val PRE_VALIDATION = ":features:application:prevalidation"
        const val APPOINTMENT = ":features:appointment"
        const val CONTRACT_ACCEPTED = ":features:application:contractaccepted"
        const val CONTRACT_LIST = ":features:contracts"
        const val COMPANY_POA_RESUMBIT = ":features:companyresubmit"
        const val EMPLOYEE_LIST = ":features:employee:list"
        const val EMPLOYEE_DETAILS = ":features:employee:details"
        const val ISSUE_CERTIFICATE = ":features:issuecertificate"
        const val FORCE_UPDATE = ":features:forceupdate"
        const val MARKET_DATA =":features:market"
        const val APPLICATION_BUILDING = ":features:applicationbuilding"
        const val LONG_LEASE_TO_MUSATAHA = ":features:application:longleasemusataha"
        const val WAIVER_MUSATAHA = ":features:application:waiverMusataha"
        const val MORTGAGE = ":features:application:mortgage"
    }

    object Commons {
        const val UI = ":common:ui" // base ui component
        const val NAVIGATION = ":common:navigation"
    }

}
